import {CustomerCriteria} from '../customer/CustomerCriteria.model';
import {PurchaseItemCriteria} from './PurchaseItemCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class PurchaseCriteria extends BaseCriteria {

    public id: number;
    public purchaseDate: Date;
    public purchaseDateFrom: Date;
    public purchaseDateTo: Date;
     public total: number;
     public totalMin: number;
     public totalMax: number;
  public customer: CustomerCriteria ;
  public customers: Array<CustomerCriteria> ;
      public purchaseItems: Array<PurchaseItemCriteria>;

}
