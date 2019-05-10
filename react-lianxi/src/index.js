import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {We} from './lianxi/ref/n1'
// import {As} from './lianxi/n4'
import {mstore} from './mobx/m1'
// import { Provider } from 'mobx-react';
import * as serviceWorker from './serviceWorker';
const store = {mstore}
console.log(store)
ReactDOM.render(
    // <Provider {...store}>
    <We user='sdyy'/>
    // </Provider>
   ,
    document.getElementById('root')
  )

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
