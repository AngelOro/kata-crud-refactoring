const listTodoReducer = (state, action) => {
    switch (action.type) {
  
      case "delete-list":
        const listUpDelete = state.list.elements.filter((item) => {
          return item.id !== action.idList;
        });
        return { ...state, list: { elements: listUpDelete } };
  
      case "add-list":
        const listUp = state.list.elements;
        listUp.push(action.item);
        return { ...state, list: { elements: listUp } };

      default:
        return state;
    }
  };


  export default listTodoReducer;