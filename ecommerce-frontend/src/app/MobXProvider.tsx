'use client';
import React from 'react';
import { StoreContext, store } from '../store/store';

export function MobXProvider({ children }: { children: React.ReactNode; }) {
    return (
        <StoreContext.Provider value={store} >
            {children}
        </StoreContext.Provider>
    );
}