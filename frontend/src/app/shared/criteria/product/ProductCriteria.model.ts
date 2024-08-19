import {CategoryCriteria} from './CategoryCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class ProductCriteria extends BaseCriteria {

    public id: number;
    public name: string;
    public nameLike: string;
    public description: string;
    public descriptionLike: string;
     public price: number;
     public priceMin: number;
     public priceMax: number;
     public quantity: number;
     public quantityMin: number;
     public quantityMax: number;

}
