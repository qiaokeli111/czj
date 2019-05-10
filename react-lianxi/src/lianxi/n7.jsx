import React from 'react'
const Aa = props =>{

  return (
    <div>
      123
      <div></div>
      {props.user}
    </div>
  )
} 

const Hoc = Com => {
  let a =321
  return props => (
    <div>
    {a}
    <hr/>
    <Com {...props} />
    <hr/>
    {a}
    </div>
  )
}

export default Hoc(Aa)