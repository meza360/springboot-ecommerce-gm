'use client';
import { ReactElement, useEffect } from 'react';
import { useStore } from '../../store/store';
import { observer } from 'mobx-react-lite';
import Container from '@mui/material/Container';
import Typography from '@mui/material/Typography';
import { Product } from '@/models/Product';
import Image from 'next/image';
import Button from '@mui/material/Button';
import './page.css';
import React from 'react';
import CartDialog from '@/components/cart-dialog/cart-dialog';

function LandingPage(): ReactElement {
    const { productStore, cartStore } = useStore();
    const { isLoading, loadProducts, products } = productStore;
    const { cart, addToCart } = cartStore;

    const [dialog, setDialog] = React.useState({ isOpen: false, dialogComponent: (<></>) });
    function handleDialogOpened(dialogOpened: string, product: Product): void {
        console.log('opening dialog');
        setDialog({ isOpen: true, dialogComponent: <CartDialog open={!dialog.isOpen} handleClose={handleClose} /> });
        addToCart(product);
    }
    function handleClose(dialogToClose?: string) {
        setDialog({ isOpen: false, dialogComponent: (<></>) });
    }



    useEffect(() => {
        loadProducts();
    }, [loadProducts, productStore]);

    return isLoading ?
        (<p>loading...</p>)
        :
        (
            <Container sx={{ display: 'flex', flexDirection: 'column', justifyItems: 'center', textAlign: 'center', marginBottom: '5em' }} className='full-width space-even'>
                {dialog.dialogComponent}
                <section className='col-flex full-width space-between'>
                    <span>
                        <Typography variant='body1' sx={{ padding: '1em 2em', textAlign: 'justify', lineHeight: '1.25em' }} className='full-width'>
                            All the products you need to level up your game!
                        </Typography>
                    </span>
                </section>
                <section className='row-flex wrap-row justify-center'>
                    {
                        products?.map((product: Product) => (
                            <span key={product.productId} className='col-flex product-card'>
                                <span>
                                    {product.name}
                                </span>
                                <span>
                                    <Image src={`${product.imageUrl}`} alt={product.name} width={50} height={50} />
                                </span>
                                <span>{product.description}</span>
                                <span>{product.price}</span>
                                <Button variant='contained' color='primary'
                                    onClick={() => handleDialogOpened('cart-dialog', product)}>Add to cart</Button>
                            </span>
                        ))
                    }
                </section>

            </Container>


        );
}

export default observer(LandingPage);