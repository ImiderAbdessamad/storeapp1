import {CategoryDto} from './Category.model';

import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ProductDto extends BaseDto{

    public name: string;

    public description: string;

    public price: null | number;

    public quantity: null | number;

    public category: CategoryDto ;


    constructor() {
        super();

        this.name = '';
        this.description = '';
        this.price = null;
        this.quantity = null;

        }

}
