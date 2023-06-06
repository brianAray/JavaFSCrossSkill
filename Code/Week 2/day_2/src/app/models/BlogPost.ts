interface BlogPostInterface{
    id: number;
    author: string;
    details: string;
}

export class BlogPost implements BlogPostInterface{
    id: number;
    author: string;
    details: string;
    
    constructor(id: number, author: string, details: string){
        this.id = id;
        this.author = author;
        this.details = details;
    }
}