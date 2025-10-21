'use client';

import { Product } from '@/models/Product';
import { useStore } from '@/store/store';
import { observer } from 'mobx-react-lite';
import Image from 'next/image';
import Button from '@mui/material/Button';

function CartPage() {
    const { cartStore } = useStore();
    const { cart, setOrder, removeFromCart, total, orderSet } = cartStore;
    return (
        <div className='col-flex justify-center align-center full-width'>
            <section className='col-flex space-between justify-center full-width my-2'>
                {
                    cart?.map((product: Product) => (
                        <span key={product.productId} className='row-flex space-between align-center full-width my-2'>
                            <span className='col-flex align-center full-width'>
                                <span>
                                    {product.name}
                                </span>
                                <span>
                                    <Image src={`${product.imageUrl}`} alt={product.name} width={50} height={50} />
                                </span>
                                <span>{product.description}</span>
                                <span>{product.price}</span>
                            </span>
                            <span className='col-flex align-center full-width'>
                                <Button variant='contained' color='primary'
                                    onClick={() => removeFromCart(product.productId)}>Remove from cart</Button>
                            </span>


                        </span>
                    ))
                }
            </section>
            <p>Total: {total}</p>
            <Button onClick={() => setOrder()}>Complete purchase</Button>
        </div>
    );
}


export default observer(CartPage);