
package Panel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.DataIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;
import javax.swing.JButton;
import ungdungquanlibaixe.Xe;

public class QuanLyXe extends javax.swing.JPanel {
    private int STT = 1;
    private List<Xe> danhSachXe = new ArrayList<>();
    private final String DATA_FILE = "dataxe.dat";
    private KhachHang khachHangPanel;
    private boolean sorted = false; 
    int enteredID;
    private List<Xe> originalData = new ArrayList<>();
    public QuanLyXe(){
        initComponents();
        loadDataFromFile();
         copyDataToOriginalList();
    }
     public void setKhachHangPanel(KhachHang khachHangPanel) {
        this.khachHangPanel = khachHangPanel;
    }
    public int getSoXeHienTai() {
        return danhSachXe.size();
    }
    private void copyDataToOriginalList() {
    originalData.clear();
    for (Xe xe : danhSachXe) {
        originalData.add(new Xe(xe.getId(), xe.getBienSo(), xe.getLoai(), xe.getThuongHieu()));
    }
}

    
   private void saveDataToFile() {
    List<Object[]> dataToSave = new ArrayList<>();
    int stt = 1;
    for (Xe xe : danhSachXe) {
        Object[] rowData = {stt, xe.getId(), xe.getBienSo(), xe.getLoai(),xe.getThuongHieu()}; // Sử dụng Id thay vì enteredID
        dataToSave.add(rowData);
        stt++;
    }

    DataIO.writeData(dataToSave, DATA_FILE);
}

    private void loadDataFromFile() {
    List<Object[]> dataFromFile = DataIO.readData(DATA_FILE);
    if (dataFromFile != null) {
        for (Object[] rowData : dataFromFile) {
            int id = (int) rowData[1]; 
            String bienSo = (String) rowData[2];
            String thuongHieu = (String) rowData[4];
            String loai = (String) rowData[3];

            Xe xe = new Xe(id, bienSo, loai, thuongHieu);
            danhSachXe.add(xe);
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (Xe xe : danhSachXe) {
            model.addRow(new Object[]{STT, xe.getId(), xe.getBienSo(), xe.getLoai(),xe.getThuongHieu() }); 
            STT++;
        }
    }
}


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Them = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ThongKe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        Add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Add.setText("+Thêm");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(382, 178));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Biển Số");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Loại");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Thương Hiệu");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("ID");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        Them.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Them.setText("+Thêm");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        Sua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sua.setText("Sửa");
        Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaActionPerformed(evt);
            }
        });

        Xoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Xoa.setText("Xóa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Tìm Kiếm Theo ID");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sắp Xếp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ThongKe.setText("Thống Kê");
        ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Them, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sua)
                        .addComponent(ThongKe))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Biển Số", "Loại", "Thương Hiệu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(291, 291, 291)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

    }//GEN-LAST:event_AddActionPerformed

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed

    KhachHang khachHangPanel = new KhachHang(); 
    String idText = jTextField1.getText();
  
    if (danhSachXe.size() >= 10) {
        JOptionPane.showMessageDialog(this, "Bãi xe đã đầy. Không thể thêm xe mới.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    
        
        try {
            enteredID = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ID là một số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

     
        if (!khachHangPanel.getCustomerIDs().contains(enteredID)) {
            JOptionPane.showMessageDialog(this, "ID không tồn tại trong danh sách khách hàng. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            return;
        }


        String bienSo = jTextField2.getText();
        String thuongHieu = jTextField3.getText();
        String loai = jTextField4.getText();

        if (bienSo.isEmpty() || thuongHieu.isEmpty() || loai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Xe xe = new Xe(enteredID,bienSo, loai, thuongHieu);

        danhSachXe.add(xe);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{STT, enteredID, xe.getBienSo(), xe.getLoai(), xe.getThuongHieu()});
        STT++;

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

        saveDataToFile();
    

    }//GEN-LAST:event_ThemActionPerformed

    @SuppressWarnings("empty-statement")
    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed
        KhachHang khachHangPanel = new KhachHang();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để sửa", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        Xe oldXe = danhSachXe.get(selectedRow);
        jTextField1.setText(String.valueOf(oldXe.getId()));
        jTextField2.setText(oldXe.getBienSo());
        jTextField3.setText(oldXe.getThuongHieu());
        jTextField4.setText(oldXe.getLoai());
      
        Them.setText("Cập nhật");
    
        for (ActionListener al : Them.getActionListeners()) {
            Them.removeActionListener(al);
        }
    
       
        Them.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               
                String idText = jTextField1.getText();
                int newID;
                try {
                    newID = Integer.parseInt(idText);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(QuanLyXe.this, "Vui lòng nhập ID là một số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
               
                if (!khachHangPanel.getCustomerIDs().contains(newID)) {
                    JOptionPane.showMessageDialog(QuanLyXe.this, "ID không tồn tại trong danh sách khách hàng. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String bienSo = jTextField2.getText();
                String thuongHieu = jTextField3.getText();
                String loai = jTextField4.getText();
               
                if (bienSo.isEmpty() || thuongHieu.isEmpty() || loai.isEmpty()) {
                    JOptionPane.showMessageDialog(QuanLyXe.this, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
               
                oldXe.setId(newID);
                oldXe.setBienSo(bienSo);
                oldXe.setThuongHieu(thuongHieu);
                oldXe.setLoai(loai);
             
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setValueAt(newID, selectedRow, 1);
                model.setValueAt(bienSo, selectedRow, 2);
                model.setValueAt(thuongHieu, selectedRow, 4);
                model.setValueAt(loai, selectedRow, 3);
             
                Them.setText("Thêm");
                for (ActionListener al : Them.getActionListeners()) {
                    Them.removeActionListener(al);
                }
                Them.addActionListener((evt1) -> {
                    ThemActionPerformed(evt1);
                });
              
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                
                saveDataToFile();
            }
        });
    

    

    }//GEN-LAST:event_SuaActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.removeRow(selectedRow);
  
    danhSachXe.remove(selectedRow);
    
    for (int i = selectedRow; i < model.getRowCount(); i++) {
        model.setValueAt(i + 1, i, 0);
    }
    STT--;
    
    saveDataToFile();

    }//GEN-LAST:event_XoaActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    
    
    String idText = jTextField5.getText();
    int searchID;
    
    
    try {
        searchID = Integer.parseInt(idText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập ID là một số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    
    for (Xe xe : danhSachXe) {
        if (xe.getId() == searchID) {
            Object[] rowData = {STT, xe.getId(), xe.getBienSo(), xe.getLoai(), xe.getThuongHieu()};
            model.addRow(rowData);
            STT++;
            return; 
        }
    }
    
  
    JOptionPane.showMessageDialog(this, "Không tìm thấy xe với ID đã nhập.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton1ActionPerformed
private void sortTableByBrand() {
  
    Collections.sort(danhSachXe, new Comparator<Xe>() {
        @Override
        public int compare(Xe xe1, Xe xe2) {
            return xe1.getThuongHieu().compareTo(xe2.getThuongHieu());
        }
    });

    
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    STT=1;

   
    for (Xe xe : danhSachXe) {
        model.addRow(new Object[]{STT, xe.getId(), xe.getBienSo(), xe.getLoai(), xe.getThuongHieu()});
        STT++;
    }
}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  JButton button = (JButton) evt.getSource();
    if (button.getText().equals("Hủy")) {
        STT=1;
        
        restoreOriginalDataToTable();
        
        
        button.setText("Sắp Xếp");
    } else {
        
        sortTableByBrand();
        
       
        button.setText("Hủy");
    }
}
    


private void restoreOriginalDataToTable() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    for (Xe xe : originalData) {
        model.addRow(new Object[]{STT, xe.getId(), xe.getBienSo(), xe.getLoai(), xe.getThuongHieu()});
        STT++;
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKeActionPerformed
    
    int soXeXeMay = 0;
    int soXeOto = 0;
    int soXeXeTai = 0;
    for (Xe xe : danhSachXe) {
        if (xe.getLoai().equals("Xe Máy")) {
            soXeXeMay++;
        } else if (xe.getLoai().equals("Oto")) {
            soXeOto++;
        } else {
            soXeXeTai++;
        }
    }
    int tien = soXeXeMay*5000 + soXeOto*15000 + soXeXeTai*20000;
    JOptionPane.showMessageDialog(this, "Số lượng xe máy: " + soXeXeMay + "\nSố lượng ôtô: " + soXeOto + "\nSố lượng xe tải: " + soXeXeTai + "\nTổng Tiền Thu được: " + tien, "Thống kê", JOptionPane.INFORMATION_MESSAGE);    
    }//GEN-LAST:event_ThongKeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Sua;
    private javax.swing.JButton Them;
    private javax.swing.JButton ThongKe;
    private javax.swing.JButton Xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
