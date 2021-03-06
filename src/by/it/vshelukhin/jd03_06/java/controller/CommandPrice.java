package by.it.vshelukhin.jd03_06.java.controller;

import by.it.vshelukhin.jd03_06.java.dao.DAO;
import by.it.vshelukhin.jd03_06.java.entity.Work;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class CommandPrice extends Action {
    @Override
    public Action execute(HttpServletRequest request) throws SQLException {
        DAO dao = DAO.getDAO();
        List<Work> worksAll = dao.workDAO.readAll("");
        request.setAttribute("wrk",worksAll);
        return Actions.PRICE.actionCommand;
    }
}
