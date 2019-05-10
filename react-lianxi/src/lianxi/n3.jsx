import React,{Component} from 'react'

export class Par extends Component {
    constructor(props){
        super(props)
        this.state={
            name:'',
            age:'',
            person:[],
            mm:[(<div>11</div>),(<div>22</div>),(<div>33</div>)]

        }
    }
    change=(e)=>{
        this.setState({[e.target.name]:e.target.value})
    }
    onChange = (stateName, stateValue) => {
        this.setState({[stateName]: stateValue});
      }
    composeChange = (name) => {
        let tt = (e) => {
            this.onChange(name, e.target.value)}
        // let tt = (e) => console.log(e)
        // console.log(e)
        // let tt = function(){ console.log(123)}
        return tt;
      }
    // aa:()=>{

    // }
    submit(e){
        const {name,age} = this.state
        var arr = [...this.state.person]
        arr.push({name:name,age:age})
        // var a = this.state.person.push({name:name,age:age})
        
        this.setState({
            // name:'',
            // age:'',
            // person:this.state.person.concat([{name:name,age:age}])
            person:arr
        })
    }

    render(){
        console.log(this.state.person)
        const {name,age,mm} = this.state
        return(
            <div>
                <span>name:</span><input value={name} name='name' type="text" onChange={this.composeChange('name')}/>
                <span>age:</span><input value={age} name='age' type="text" onChange={this.composeChange('age')}/>
                <div><button onClick={this.submit.bind(this)}>确认</button></div>
                <div>
                   { this.state.person.map((e,index)=>(
                        <Child key={index} name={e.name} age={e.age}></Child>
                        ))
                }
                </div>
            </div>
        )
    }
}

class Child  extends Component {   
    componentWillReceiveProps(newProps){
           console.log(`我新的props的name是${newProps.name}，age是${newProps.age}。我以前的props的name是${this.props.name}，age是${this.props.age}是我要re-render了`);
           }   
    render(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    return (
        <div>
            <span> 姓名:  </span>
            <span>{this.props.name}</span>
            <span> 年龄:  </span>
            <span>{this.props.age}</span>
        </div>
    )
    } 
}