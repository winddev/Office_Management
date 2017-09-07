package office_management.dao;


import office_management.model.Office;

import java.util.List;


public interface OfficeDao {

    public void addOffice(Office office);

    public void updateOffice(Office office);

    public void removeOffice(int id);

    public Office getOfficeById(int id);

    public List<Office> listOffice();


}
