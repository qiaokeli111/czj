import React,{Component,PureComponent} from 'react'

export class As extends Component{
    state={
        num:{a:{b:{c: 3}}},
        ae:[1,3,4,5,6,7],
        no:1,
        a:2,
        c:3
    }
    add=()=>{
        let num = JSON.parse(JSON.stringify(this.state.num))
        // let num = this.state.num
        num.a.b.c = 34
        this.setState({num},()=>{console.log(this.state.num)})
    }
    addw=()=>{
        this.setState({
            no:this.state.no+1
        })
    }
    componentWillMount(){
        this.hel = 'what'
    }
    componentDidUpdate(){
        
    }
    render(){
        return(
            <div>
                <h1>one</h1>
                {this.hel}
                <button onClick={this.add}>aaa</button>
                <button onClick={this.addw}>bbb</button>
                <Bs num={this.state.num}>haha</Bs>
            </div>
        )
    }
}

class Bs extends PureComponent{
    state={
        rra : 3
    }
    
    render(){
        console.log(12)
        return(
            <div>
                <h2>two</h2>
                <div>{this.state.rra}</div>
                <div>{this.props.num.a.b.c}</div>
                {this.props.children}
            </div>
        )
    }
}