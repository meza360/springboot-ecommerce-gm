import { runInAction } from 'mobx';
import { makeAutoObservable } from 'mobx';
import apiAgent from '../api/agent';
import { Product } from '../models/Product';
export default class InicioStore {
    products: Product[] | null = [];
    selectedProduct: Product | null = null;
    isLoading: boolean = false;
    constructor () {
        makeAutoObservable(this);
    }

    setLoadingInitial = (state: boolean) => {
        this.isLoading = state;
    };

    setProducts = (products: Product[]) => {
        this.products = products;
    };

    loadProducts = async () => {
        this.setLoadingInitial(true);
        try {
            const productResponse: Product[] = await apiAgent.Products.listProducts();
            runInAction(() => {
                console.log(productResponse);
                this.setProducts(productResponse);
            });
            this.setLoadingInitial(false);
        }
        catch (error) {
            console.error("Error loading product: ", error);
            this.setLoadingInitial(false);
        }
    };
}