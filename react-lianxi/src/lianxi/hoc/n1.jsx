import React ,{Component} from 'react'

const Com = props=>(
  <div>
    123
  </div>
)

function logProps(Component) {
  class LogProps extends React.Component {
    componentDidUpdate(prevProps) {
      console.log('old props:', prevProps);
      console.log('new props:', this.props);
    }

    render() {
      const {forwardedRef, ...rest} = this.props;

      // 将自定义的 prop 属性 “forwardedRef” 定义为 ref
      return(
        <div>
          <Component ref={forwardedRef} {...rest} />
        </div>
      ) 
    }
  }
  return React.forwardRef((props, ref) => {
    return <LogProps {...props} forwardedRef={ref} />;
  });
}
const Iiww = logProps(Com)

export class Os extends Component{
  dw = () =>{
    console.log(12)
    debugger
  }
  render(){
    return (
      <div>
        <Iiww />
        <button onClick={this.dw}>asdas</button>
      </div>
    )
  }
}