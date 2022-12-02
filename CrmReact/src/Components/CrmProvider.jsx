import { createContext } from "react";

const CrmContext = createContext();

const CrmProvider = ({ children }) => {
  return (
    <CrmContext.Provider
      value={{
        id,
        type,
        date,
        description,
      }}
    >
      {children}
    </CrmContext.Provider>
  );
};

export { CrmProvider };

export default CrmContext;
