package edu.sabana.poob.sabanapayroll;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ColsubsidioFund implements IFamilyCompensationFund {

    private static Map<UUID, Employee> registeredEmployees = new HashMap<>();

    public ColsubsidioFund() {

    }

    /**
     * No permite registrar empleados de tipo EmployeeByCommission.
     *
     * @param employee
     * @return
     */
    @Override
    public boolean registerEmployee(Employee employee) throws FamilyCompensationFundException {
        boolean amigo= false;
        if(!(registeredEmployees.containsKey(employee.id)))
        {   amigo = true;
            registeredEmployees.put(employee.id, employee);}

        if(!amigo){throw new FamilyCompensationFundException(FamilyCompensationFundException.EMPLOYEE_REGISTERED);}

        if(employee.getClass().getSimpleName().equals("EmployeeByComission")){
            throw new FamilyCompensationFundException(FamilyCompensationFundException.EMPLOYEE_NOT_ALLOWED);
        }
        return true;
    }

    @Override
    public boolean deleteEmployee(UUID id) throws FamilyCompensationFundException {
        boolean amigo = false;
        if(registeredEmployees.containsKey(id)){
            registeredEmployees.remove(id);
            amigo = true;
        }
        else {throw new FamilyCompensationFundException(FamilyCompensationFundException.EMPLOYEE_IS_NOT_REGISTERED);
        }
        return amigo;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean amigo = false;
        if(registeredEmployees.containsKey(id)){
            amigo = true;
        }return amigo;
    }

    @Override
    public String printBenefits() {
        return "No nos dan ni para comer :)";
    }
}
