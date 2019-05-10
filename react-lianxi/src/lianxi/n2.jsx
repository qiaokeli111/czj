import React, { Component } from 'react'
import PropTypes from 'prop-types'
// import ReactDOM from 'react-dom'
import { createStore , applyMiddleware} from 'redux'
import thunk from 'redux-thunk';
import {  connect } from 'react-redux'

// React component
class Counter extends Component {
  render() {
    const { value, onIncreaseClick ,text} = this.props
    console.log(123)
    return (
      <div>
        <span>{value}</span>
        <button onClick={onIncreaseClick}>Increase</button>
        <input onChange={onIncreaseClick} type="text"/>
        <span>{text}</span>
      </div>
    )
  }
}

Counter.propTypes = {
  value: PropTypes.number.isRequired,
  onIncreaseClick: PropTypes.func.isRequired
}

// Action
// const increaseAction = { type: 'increase' }

function te(text){
  return { type: 'change' ,data:text}
}

// Reducer
function counter(state = { count: 0 ,text:'haaha'}, action) {
  // const count = state.count
  switch (action.type) {
    case 'increase':{
      let source = JSON.parse(JSON.stringify(state))
      source.count = source.count+1
      return { ...state, ...source }}
      case 'change':{
      let source = JSON.parse(JSON.stringify(state))
      source.text = action.data
      console.log(source)
      return { ...source}}
    default:
      return state
  }
}

// Store
export const store = createStore(counter,applyMiddleware(thunk))
// export const store = createStore(counter)

// Map Redux state to component props
function mapStateToProps(state) {
  return {
    value: state.count,
    text:state.text
  }
}
async function wait (){
  return new Promise((resolve)=>{
      setTimeout(() => {
        console.log(4334)
        resolve()
      }, 1);
  })
}

 let asyy=(text)=>(
    async (dispatch)=>{
      await wait()
      dispatch(te(text))
    }
  )

// Map Redux actions to component props
function mapDispatchToProps(dispatch) {
  return {
    onIncreaseClick: (e,te) =>{ 
      dispatch(asyy(e.target.value))}
  }
}

// Connected Component
export const App = connect(
  mapStateToProps,
  mapDispatchToProps
)(Counter)
