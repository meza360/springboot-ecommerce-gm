import { makeAutoObservable, runInAction } from 'mobx';
import apiAgent from '../api/agent';
import { Order } from '../models/Order';
import { Product } from '../models/Product';


export default class CartStore {
    productos: Product[] = [];
    cart: Product[] = [];
    registroProducto = new Map<string, Product>();
    productSelected: Product | undefined = undefined;
    editMode = false;
    cargando = false;
    cargandoInicial = false;
    total: number = 0;
    orderSet: boolean = false;

    constructor () {
        makeAutoObservable(this);
    }

    totalCart = (): void => {
        this.total = 0;
        for (const product of this.cart) {
            this.total += product.price;
        }
    };

    addToCart = (product: Product): void => {
        this.cart.push(product);
        console.log("Product added to cart:", product);
        console.log("Current cart:", this.cart);
        this.totalCart();
    };

    removeFromCart = (id: number) => {
        let prod = this.cart.findIndex((a) => a.productId === id);
        this.cart.splice(prod, 1);
        this.totalCart();
    };

    setOrder = async () => {
        console.log("Sending order: {} with total: {}", this.cart, this.total);
        await apiAgent.Orders.setOrder({
            billTo: 'Giovani Meza',
            total: this.total,
            cartItems: this.cart.map(item => ({
                productId: item.productId,
                name: item.name,
                description: item.description,
                price: item.price
            }))
        });
        this.cart = [];
        this.orderSet = true;
    };


}
