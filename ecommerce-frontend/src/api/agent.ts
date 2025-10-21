import axios, { AxiosResponse } from 'axios';
import { Product } from '../models/Product';
import { Order } from '@/models/Order';

axios.defaults.baseURL = 'http://192.168.0.63:8080';
axios.defaults.baseURL = 'https://gt2-ecommerce-api.apps.gt2software.dev';

/* axios.interceptors.response.use(async (response) => {
    try {
        await sleep(1000);
        return response;
    } catch (error) {
        console.log(error);
        return await Promise.reject(error);
    }
}); */

const responseBody = <T>(response: AxiosResponse<T>) => response.data;

const requests = {
    get: <T>(url: string) => axios.get<T>(url).then(responseBody),
    post: <T>(url: string, body: {}) => axios.post<T>(url, body).then(responseBody),
    put: <T>(url: string, body: {}) => axios.put<T>(url, body).then(responseBody),
    del: <T>(url: string) => axios.delete<T>(url).then(responseBody)
};

const Products = {
    listProducts: () => requests.get<Product[]>('/sales/products'),
    getProductById: (id: string) => requests.get<Product>(`/sales/products/${id}`),
    createProduct: (producto: Product) => requests.post<void>('/management/products', producto),
    updateProduct: (producto: Product) => requests.put<void>('/management/products', producto),
    deleteProduct: (id: string) => requests.del<void>(`/management/products/${id}`)
};

const Orders = {
    setOrder: (order: Order) => requests.post<void>('/sales/order', order)
};

const apiAgent = {
    Products,
    Orders
};

export default apiAgent;