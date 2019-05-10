import React ,{Component} from 'react'

export  class We extends Component{
  constructor(){
    super();
    this.ae = React.createRef();
  }
  state={
    a:122
  }
  fer=()=>{
    console.log(this.ae)
    this.ae.current.io()
  }
  render(){
    return(
      <div>
        {this.state.a}
        <button onClick={this.fer}>sdaw</button>
        <Wpp ref={this.ae}/>
        
      </div>
    )
  }
}

class Wpp extends Component{
  io=()=>{
    console.log(333)
  }
  render(){
    return(
      <div>asd</div>
    )
  }
}