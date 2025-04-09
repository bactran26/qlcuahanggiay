package DAL;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAL.MySQLHelper.MySQLHelpers;
import DTO.SanPhamDTO;
import javax.swing.JOptionPane;

public class SanPhamDAL {

    public ArrayList<SanPhamDTO> getProductList() throws SQLException {
        ArrayList<SanPhamDTO> list = new ArrayList<>();
        MySQLHelpers helper = new MySQLHelpers();
        ResultSet result = helper.selectAllFromTable("tblsanpham");
        try {
            while (result.next()) {
                list.add(new SanPhamDTO(
                        result.getString("Magiay"),
                        result.getString("Tengiay"),
                        result.getString("Doituongsd"),
                        result.getString("Chatlieu"),
                        result.getString("Maloai"),
                        result.getString("Maxx"),
                        result.getString("Mamau"),
                        result.getString("Mathuonghieu"),
                        result.getInt("Soluong"),
                        result.getInt("Gia"),
                        result.getInt("Size")
                ));
            }
            result.close();
            helper.closeConnect();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
                    return list;
    }
    public boolean InsertProduct(SanPhamDTO sanpham){
        MySQLHelpers helper = new MySQLHelpers();
        
    }
}
