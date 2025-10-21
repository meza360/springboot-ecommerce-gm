import { ProductDto } from './Product';

export interface Order {
    billTo: string;
    total: number;
    cartItems: ProductDto[];
    orderId?: string;
}