package edu.sabana.poob.sabanapayroll;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class CafamFund implements IFamilyCompensationFund{

    private static Set<UUID> registeredEmployees = new HashSet<>();

    public CafamFund(){}

    @Override
    public boolean registerEmployee(Employee employee) throws FamilyCompensationFundException{
        boolean amigo= false;
        if(!(registeredEmployees.contains(employee.id)))
        {   amigo = true;
            registeredEmployees.add(employee.id);}
        if(employee.getClass().getSimpleName().equals("EmployeeByHours")){
            throw new FamilyCompensationFundException(FamilyCompensationFundException.EMPLOYEE_NOT_ALLOWED);
        }
        return amigo;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean amigo = false;
        if(registeredEmployees.contains(id)){
            registeredEmployees.remove(id);
            amigo = true;
        }return amigo;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean amigo = false;
        if(registeredEmployees.contains(id)){
            amigo = true;
        }return amigo;
    }

    @Override
    public String printBenefits() {
        return "No nos dan ni para comer :)";
    }
}
