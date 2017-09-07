package office_management.service;


import office_management.dao.OfficeDao;
import office_management.model.Office;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService{

    private OfficeDao officeDao;

    public void setOfficeDao(OfficeDao officeDao) {
        this.officeDao = officeDao;
    }

    @Override
    @Transactional
    public void addOffice(Office office) {
        this.officeDao.addOffice(office);
    }

    @Override
    @Transactional
    public void updateOffice(Office office) {
        this.officeDao.updateOffice(office);
    }

    @Override
    @Transactional
    public void removeOffice(int id) {
        this.officeDao.removeOffice(id);
    }

    @Override
    @Transactional
    public Office getOfficeById(int id) {
        return this.officeDao.getOfficeById(id);
    }

    @Override
    @Transactional
    public List<Office> listOffice() {
        return this.officeDao.listOffice();
    }
}
