import {CustomerDto} from '../customer/Customer.model';
import {PurchaseItemDto} from './PurchaseItem.model';

import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseDto extends BaseDto{

   public purchaseDate: Date;

    public total: null | number;

    public customer: CustomerDto ;
     public purchaseItems: Array<PurchaseItemDto>;


    constructor() {
        super();

        this.purchaseDate = null;
        this.total = null;
        this.customer = new CustomerDto() ;
        this.purchaseItems = new Array<PurchaseItemDto>();

        }

}
