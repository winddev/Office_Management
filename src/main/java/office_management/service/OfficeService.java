package office_management.service;


import office_management.model.Office;

import java.util.List;

public interface OfficeService {
    public void addOffice(Office office);

    public void updateOffice(Office office);

    public void removeOffice(int id);

    public Office getOfficeById(int id);

    public List<Office> listOffice();
}
