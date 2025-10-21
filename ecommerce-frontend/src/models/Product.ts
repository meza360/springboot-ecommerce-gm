export interface Product {
    productId: number;
    name: string;
    description: string;
    category: string;
    price: number;
    imageUrl: string;
}

export interface ProductDto {
    productId: number;
    name: string;
    description: string;
    price: number;
}
