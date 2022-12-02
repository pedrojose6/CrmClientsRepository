import { useContext } from "react";
import CrmContext from "../context/CrmProvider";

const useCrm = () => {
  return useContext(CrmContext);
};

export default useCrm;
