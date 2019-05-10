import React,{Component} from 'react'
import { inject, observer } from 'mobx-react';

@inject('mstore')
@observer
class Mo extends Component {

    state = {
        as:this.props.mstore.length
    }
    c = ()=> {
        this.props.mstore.change()
        
    };
   
    render(){
        return(
            <div>
                <div onClick={this.c}>
                    change
                </div>
                {this.state.as}
            </div>
        )
    }
}
export default Mo