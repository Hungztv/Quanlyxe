
package Panel;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.DataIO;
import java.awt.event.ActionListener;
import ungdungquanlibaixe.QuanLyKhachHang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class KhachHang extends javax.swing.JPanel {
    private int STT = 1;
    private List<QuanLyKhachHang> danhSachKhachHang = new ArrayList<>();
    private final String DATA_FILE = "data.dat";
    private boolean isSearching = false;
  
    public KhachHang() {
        initComponents();
        loadDataFromFile();
        
    }
    public List<Integer> getCustomerIDs() {
        List<Integer> ids = new ArrayList<>();
        for (QuanLyKhachHang khachHang : danhSachKhachHang) {
            ids.add(khachHang.getId());
        }
        return ids;
    }
   private void saveDataToFile() {
        List<Object[]> dataToSave = new ArrayList<>();
        for (QuanLyKhachHang khachHang : danhSachKhachHang) {
            Object[] rowData = {STT, khachHang.getId(), khachHang.getTen(), khachHang.getSoDienThoai(), khachHang.getEmail()};
            dataToSave.add(rowData);
            STT++;
        }

        DataIO.writeData(dataToSave, DATA_FILE);
    }  
   
    private void loadDataFromFile() {
    List<Object[]> dataFromFile = DataIO.readData(DATA_FILE);
    if (dataFromFile != null) {
        DefaultTableModel model = (DefaultTableModel) Khachhang.getModel();
        model.setRowCount(0); 
        STT = 1; 

        for (Object[] rowData : dataFromFile) {
            int id = (int) rowData[1];
            String ten = (String) rowData[2];
            String soDienThoai = (String) rowData[3];
            String email = (String) rowData[4];

            QuanLyKhachHang khachHang = new QuanLyKhachHang(id, ten, soDienThoai, email);
            danhSachKhachHang.add(khachHang);

            
            model.addRow(new Object[]{STT, khachHang.getId(), khachHang.getTen(), khachHang.getSoDienThoai(), khachHang.getEmail()});
            STT++;
        }
    }
}
   
   
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        TimKiem = new javax.swing.JButton();
        SapXep = new javax.swing.JButton();
        ThongKe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Khachhang = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Tên Khách Hàng");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Số Điện Thoại");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Add.setText("+Thêm");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Sua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sua.setText("Sửa");
        Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Delete.setText("Xóa");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        TimKiem.setText("Tìm Kiếm");
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });

        SapXep.setText("Sắp Xếp");
        SapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SapXepActionPerformed(evt);
            }
        });

        ThongKe.setText("Thống Kê");
        ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Sua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SapXep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SapXep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Tên Khách Hàng", "Số Điện Thoại", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Khachhang);
        if (Khachhang.getColumnModel().getColumnCount() > 0) {
            Khachhang.getColumnModel().getColumn(2).setResizable(false);
            Khachhang.getColumnModel().getColumn(3).setResizable(false);
            Khachhang.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
     String ten = jTextField1.getText();
        String soDienThoai = jTextField2.getText();
        String email = jTextField3.getText();

        
        if (ten.isEmpty() || soDienThoai.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

      
        int generatedID;
        if (soDienThoai.length() >= 3) {
            String lastThreeDigits = soDienThoai.substring(soDienThoai.length() - 3);
            generatedID = Integer.parseInt(lastThreeDigits);
        } else {
            
            generatedID = Integer.parseInt(soDienThoai);
        }

        QuanLyKhachHang khachHang = new QuanLyKhachHang(generatedID,ten,soDienThoai,email);

        
        danhSachKhachHang.add(khachHang);

       
        DefaultTableModel model = (DefaultTableModel) Khachhang.getModel();
        Object[] rowData = {STT, (Object)khachHang.getId(), khachHang.getTen(), khachHang.getSoDienThoai(), khachHang.getEmail()};
        model.addRow(rowData);
        STT++;

       
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

      

        saveDataToFile();
        
    }//GEN-LAST:event_AddActionPerformed
    public void onClose() {
        saveDataToFile();
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed

    int selectedRow = Khachhang.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để sửa", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
  
    QuanLyKhachHang oldKhachHang = danhSachKhachHang.get(selectedRow);
    // Hiển thị thông tin cũ trong các trường nhập liệu
    jTextField1.setText(oldKhachHang.getTen());
    jTextField2.setText(oldKhachHang.getSoDienThoai());
    jTextField3.setText(oldKhachHang.getEmail());
   
    Add.setText("Cập Nhật");
  
    for (ActionListener al : Add.getActionListeners()) {
        Add.removeActionListener(al);
    }
    
    Add.addActionListener((java.awt.event.ActionEvent evt1) -> {
       
        String newTen = jTextField1.getText();
        String newSoDienThoai = jTextField2.getText();
        String newEmail = jTextField3.getText();
        
        if (newTen.isEmpty() || newSoDienThoai.isEmpty() || newEmail.isEmpty()) {
            JOptionPane.showMessageDialog(KhachHang.this, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        oldKhachHang.setTen(newTen);
        oldKhachHang.setSoDienThoai(newSoDienThoai);
        oldKhachHang.setEmail(newEmail);   
        int oldID = oldKhachHang.getId();
        int newID;
        if (newSoDienThoai.length() >= 3) {
            String lastThreeDigits = newSoDienThoai.substring(Math.max(0, newSoDienThoai.length() - 3));
            newID = Integer.parseInt(lastThreeDigits);
        } else {
            
            newID = Integer.parseInt(newSoDienThoai);
        }
        
        if (oldID != newID) {
            oldKhachHang.setId(newID);
           
        }
       
        DefaultTableModel model = (DefaultTableModel) Khachhang.getModel();
         model.setValueAt(newID, selectedRow, 1);
        model.setValueAt(newTen, selectedRow, 2);
        model.setValueAt(newSoDienThoai, selectedRow, 3);
        model.setValueAt(newEmail, selectedRow, 4);       
       
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");       
      
        Add.setText("+Thêm");      
        
        for (ActionListener al : Add.getActionListeners()) {
            Add.removeActionListener(al);
        }     
        saveDataToFile();
    });
 

     
    }//GEN-LAST:event_SuaActionPerformed
    private void updateSTT() {
    for (int i = 0; i < danhSachKhachHang.size(); i++) {
        Khachhang.setValueAt(i + 1, i, 0); 
    }
}
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
   int selectedRow = Khachhang.getSelectedRow();
    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) Khachhang.getModel();
        model.removeRow(selectedRow);
        danhSachKhachHang.remove(selectedRow);
        updateSTT(); 
        saveDataToFile(); 
       

    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng để xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_DeleteActionPerformed

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
     String keyword = jTextField4.getText(); 
    
    
    if (!isSearching) {
        
        TimKiem.setText("Hủy");
        
       
        isSearching = true;
        
       
        
        
        searchCustomer(keyword);
        
        
        Add.setEnabled(false);
        Sua.setEnabled(false);
        Delete.setEnabled(false);
        
    } else {

        TimKiem.setText("Tìm Kiếm");
        
       
        isSearching = false;
        
        loadDataFromFile();
        
       
        Add.setEnabled(true);
        Sua.setEnabled(true);
        Delete.setEnabled(true);
    }
}

private void searchCustomer(String keyword) {
    DefaultTableModel model = (DefaultTableModel) Khachhang.getModel();
    model.setRowCount(0); 

    for (QuanLyKhachHang khachHang : danhSachKhachHang) {
        if (khachHang.getTen().toLowerCase().contains(keyword.toLowerCase()) ||
            khachHang.getSoDienThoai().contains(keyword) ||
            khachHang.getEmail().toLowerCase().contains(keyword.toLowerCase())) {
            
            boolean exists = false;
            for (int i = 0; i < model.getRowCount(); i++) {
                if ((int) model.getValueAt(i, 1) == khachHang.getId()) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                
                Object[] rowData = {STT, khachHang.getId(), khachHang.getTen(), khachHang.getSoDienThoai(), khachHang.getEmail()};
                model.addRow(rowData);
                STT++;
            }
        }
    }

    
    }//GEN-LAST:event_TimKiemActionPerformed

    private void SapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SapXepActionPerformed
       Collections.sort(danhSachKhachHang, new Comparator<QuanLyKhachHang>() {
        @Override
        public int compare(QuanLyKhachHang kh1, QuanLyKhachHang kh2) {
            String ten1 = kh1.getTen();
            String ten2 = kh2.getTen();
            String lastName1 = ten1.substring(ten1.lastIndexOf(" ") + 1);
            String lastName2 = ten2.substring(ten2.lastIndexOf(" ") + 1);
            return lastName1.compareToIgnoreCase(lastName2);
        }
    });
    
    STT=1;
    refreshTable();
}

private void refreshTable() {
    DefaultTableModel model = (DefaultTableModel) Khachhang.getModel();
    model.setRowCount(0); 
    
    for (QuanLyKhachHang khachHang : danhSachKhachHang) {
        Object[] rowData = {STT, khachHang.getId(), khachHang.getTen(), khachHang.getSoDienThoai(), khachHang.getEmail()};
        model.addRow(rowData);
        STT++;
    }
    }//GEN-LAST:event_SapXepActionPerformed

    private void ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKeActionPerformed
        int soKhachHang = danhSachKhachHang.size();
    JOptionPane.showMessageDialog(this, "Số lượng khách hàng: " + soKhachHang, "Thống Kê", JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_ThongKeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JTable Khachhang;
    private javax.swing.JButton SapXep;
    private javax.swing.JButton Sua;
    private javax.swing.JButton ThongKe;
    private javax.swing.JButton TimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables


}
