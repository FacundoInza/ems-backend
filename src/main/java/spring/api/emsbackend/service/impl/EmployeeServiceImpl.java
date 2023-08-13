package spring.api.emsbackend.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.api.emsbackend.dto.EmployeeDto;
import spring.api.emsbackend.entity.Employee;
import spring.api.emsbackend.exception.ResourceNotFoundException;
import spring.api.emsbackend.mapper.EmployeeMapper;
import spring.api.emsbackend.repository.EmployeeRepository;
import spring.api.emsbackend.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exists with given id > " + employeeId));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }

}
