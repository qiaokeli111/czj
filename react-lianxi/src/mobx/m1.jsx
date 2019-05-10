import { observable, action, computed } from 'mobx';

 class Store {
    @observable list = []
    @observable length = 2;


    @computed get total() {
      return this.length;
    }
    @action change () {
      this.length++
    }
    @computed get squared() {
        return this.length * this.length;
      }
     
  };
  
  export const mstore = new Store();
  
  