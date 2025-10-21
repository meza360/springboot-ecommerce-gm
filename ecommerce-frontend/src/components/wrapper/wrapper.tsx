'use client';
import React from 'react';
import Header from '../header/header';
import Footer from '../footer/footer';
import { StoreContext, useStore } from '../../store/store';
export default function Wrapper({ children }: { children: React.ReactNode; }) {
    const [value, setNewValue] = React.useState('landing');
    function handleRouteChange(newValue: string) {
        console.log(newValue);
        setNewValue(newValue);
    }
    const store = useStore();
    return (
        <>
            <StoreContext.Provider value={store}>
                <Header></Header>
                {children}
                <Footer onNavigation={handleRouteChange} route={value}></Footer>
            </StoreContext.Provider>
        </>
    );
}