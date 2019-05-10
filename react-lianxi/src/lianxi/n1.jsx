import React,{Component} from 'react'

export class Aa extends Component{
    state={
        a:11,
        b:22
    }
    add= ()=>{
        return ()=>{
            console.log(3233)
        }
    }
    del= ()=>{
        this.bb.tt()
    }
    ch=(e)=>{
        this.setState({
            a:e.target.value
        })
    }
    render(){
        console.log(111)
        return (
            <div>
                <button onClick={this.add()}>add</button>
                <button onClick={this.del}>inc</button>
            <Bb {...this.state} ch = {this.ch} ref={ee=>{
                this.bb=ee
            }}/>
            </div>
        )
    }
}

class Bb extends Component{
    
    tt(){
        console.log(12323)
    }
    render(){
        return(
            <div>
                im tou
                {console.log(123)}
                <h1>1</h1>
                    <Cc {...this.props} ></Cc>
                <h1>2</h1>
                im wei
            </div>
        )
    }
}

function Cc(props){
    return(
        <div>
            <input onChange={props.ch} value={props.a} type="text"/>
            <div>{props.a}  sad   {props.b}</div>
        </div>
        
    )
}