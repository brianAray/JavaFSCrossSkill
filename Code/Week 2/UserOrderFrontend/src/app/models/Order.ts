interface OrderInterface {
    userId: number;
    description: string;
}

export class Order implements OrderInterface{
    userId: number;
    description: string;
    constructor(userId: number, description: string){
        this.userId = userId;
        this.description = description;
    }
}