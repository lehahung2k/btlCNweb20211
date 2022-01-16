import {Role} from "../enum/Role";

export class User {

    email: string;

    password: string;

    name: string;

    phone: string;

    address: string;

    active: string;

    role: string;

    constructor(){
        this.active = 't';
        this.role = Role.Customer;
    }
}
