import React, { useReducer, createContext } from 'react';
import todoReducer from '../reducer/toDoReducer';

const initialState = {
  todo: { list: [], item: {} },
  list: { elements: []}
};

export const Store = createContext(initialState)

const StoreProvider = ({ children }) => {
    const [state, dispatch] = useReducer(todoReducer, initialState);
  
    return <Store.Provider value={{ state, dispatch }}>
      {children}
    </Store.Provider>
  
}

export default StoreProvider;


  