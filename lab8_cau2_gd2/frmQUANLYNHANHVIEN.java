/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_cau2_gd2;

import lab5_cau5_gd1_gd2.Employee.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

import javax.swing.table.*;

/**
 *
 * @author home
 */
public class frmQUANLYNHANHVIEN extends javax.swing.JFrame {

    public void showClock() {
        //1. tao 1 doi tuong
        Thread a = new Thread() {
            public void run() {
                try {
                    while (true) {
                        //1. lay ngay gio hệ thống
                        Date now = new Date();
                        SimpleDateFormat format = new SimpleDateFormat();
                        //2. định dạng gio phút giây AM/PM
                        format.applyPattern("hh:mm:ss aa");
                        String kq = format.format(now);
                        lblDONGHO.setText(kq);
                        Thread.sleep(1000); // ngủ 1 giây.
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        a.start();
    }

    public frmQUANLYNHANHVIEN() {
        initComponents();
        //1. nho trong constructor goi ham hien thi dong ho
        showClock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        lblDONGHO = new java.awt.Label();
        btnPREVIOUS = new javax.swing.JButton();
        btnFIRST = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTUOI = new javax.swing.JTextField();
        txtMANV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEMAIL = new javax.swing.JTextField();
        btnLAST = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblStatus = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEMPLOYEE = new javax.swing.JTable();
        btnNEXT = new javax.swing.JButton();
        txtHOTEN = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtSAVE = new javax.swing.JButton();
        btnNEW = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        btnFIND = new javax.swing.JButton();
        btnEXIT = new javax.swing.JButton();
        btnOPEN = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnOrderByName = new javax.swing.JButton();
        btnOrderBySalary = new javax.swing.JButton();
        txtLUONG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Lương");

        lblDONGHO.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDONGHO.setForeground(new java.awt.Color(204, 0, 51));
        lblDONGHO.setText("10:20 AM");

        btnPREVIOUS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnPREVIOUS.setText("<<");
        btnPREVIOUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPREVIOUSActionPerformed(evt);
            }
        });

        btnFIRST.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnFIRST.setText("I<");
        btnFIRST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIRSTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Họ Tên");

        txtTUOI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMANV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Mã Nhân Viên");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Tuổi");

        txtEMAIL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnLAST.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnLAST.setText(">I");
        btnLAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLASTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Email");

        lblStatus.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 0, 0));
        lblStatus.setText("Record 1 of 10");

        tblEMPLOYEE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Họ và Tên", "Tuổi", "Email", "Lương"
            }
        ));
        tblEMPLOYEE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEMPLOYEEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEMPLOYEE);

        btnNEXT.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnNEXT.setText(">>");
        btnNEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEXTActionPerformed(evt);
            }
        });

        txtHOTEN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtSAVE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtSAVE.setText("Save");
        txtSAVE.setToolTipText("");
        txtSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSAVEActionPerformed(evt);
            }
        });

        btnNEW.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnNEW.setText("New");
        btnNEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWActionPerformed(evt);
            }
        });

        btnDELETE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnDELETE.setText("Delete");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });

        btnFIND.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnFIND.setText("Find");
        btnFIND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDActionPerformed(evt);
            }
        });

        btnEXIT.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEXIT.setText("Exit");
        btnEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXITActionPerformed(evt);
            }
        });

        btnOPEN.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnOPEN.setText("Open");
        btnOPEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOPENActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnOrderByName.setText("Order By Name");
        btnOrderByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderByNameActionPerformed(evt);
            }
        });

        btnOrderBySalary.setText("Order By Salary");
        btnOrderBySalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderBySalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrderByName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNEW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDELETE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFIND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOPEN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEXIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSAVE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderBySalary, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNEW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSAVE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDELETE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFIND)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOPEN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEXIT)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderByName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderBySalary)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtLUONG.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(64, 64, 64)
                                            .addComponent(jLabel2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTUOI, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(btnFIRST, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPREVIOUS)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnNEXT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLAST)))))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDONGHO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblDONGHO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTUOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFIRST)
                            .addComponent(btnPREVIOUS)
                            .addComponent(btnNEXT)
                            .addComponent(btnLAST)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //1. Khai báo 1 danh sách nhân viên list
    List<Employee> list = new ArrayList<>();
    //2. khai báo 1 biến currentIndex : vị trí nhân viên hiện hành
    int currentIndex = 0;

    public void addEmployee() {
        // 1. Tạo 1 đối tượng Employee
        Employee emp = new Employee();
        try {
            //2. gán dữ liệu từ text field vào đối tượng nhân viên emp
            emp.setMaNV(txtMANV.getText());
            emp.setHoTen(txtHOTEN.getText());
            emp.setTuoi(Integer.parseInt(txtTUOI.getText()));
            emp.setEmail(txtEMAIL.getText());
            emp.setLuong(Integer.parseInt(txtLUONG.getText()));
            //3. add vào danh sách nhân viên list
            if(existsID()==true){
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại");
            } else {            
                list.add(emp);
            }

        } catch (Exception e) {
            // chửi bắt lỗi câu lệnh ném throw từ class Employee ném ra
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
    }

    // load dữ liệu từ danh sách nhân viên list lên bảng.
    public void fillToTable() {
        //1. lấy mô hình dữ liệu và xóa sạch các hàng
        DefaultTableModel model = (DefaultTableModel) tblEMPLOYEE.getModel();
        model.setRowCount(0);
        //2. duyệt qua danh sách nhân viên list, lấy từng nhân viên thêm vào table
        for (Employee emp : list) {
            Object[] row = new Object[]{emp.getMaNV(), emp.getHoTen(), emp.getTuoi(), emp.getEmail(), emp.getLuong()};
            model.addRow(row);
        }
    }

    // hàm hiện thị chi tiết nhân viên
    public void showDetail() {
        //1. Lấy ra nhân viên trong danh sách list tại vị trí currentIndex
        Employee emp = list.get(currentIndex);
        //2. Điền thông tin nhân viên này lên các controls
        txtMANV.setText(emp.getMaNV());
        txtHOTEN.setText(emp.getHoTen());
        txtTUOI.setText("" + emp.getTuoi());
        txtEMAIL.setText(emp.getEmail());
        txtLUONG.setText("" + emp.getLuong());
        //3. gọi lại hàm hiện thị trạng thái
        displayStatus();
    }

    // Hiện thị trạng thái : đang ở vị trị nhân viên nào / tổng số nhân viên
    public void displayStatus() {
        lblStatus.setText("Record " + (currentIndex + 1) + " of " + list.size());
    }

    public void saveFile() {
        //1. lưu danh sách nhân viên list xuống file e:/employee.dat
        XFile.writeObject("e:/employee.dat", list);
        JOptionPane.showMessageDialog(this, "Lưu xuống thành công.");
    }

    public void openFile() {
        // đọc từ file lên danh sách list
        list = (ArrayList<Employee>) XFile.readObject("e:/employee.dat");
    }

    public void removeEmployee() {
        String text = txtMANV.getText();
        boolean kq=false;
        for(Employee emp : list){
            if(emp.getMaNV().equalsIgnoreCase(text)){
                list.remove(emp);
                kq=true;
                return;
            }
        }
        if(kq==false){
            JOptionPane.showMessageDialog(this, "Mã số "+text+" không tồn tại");
        }
    }

    public void findEmployee() {
        //1. tìm theo maNV neu nguoi dung nhap vao maNV
        if (txtMANV.getText().length() > 0) {

            //1. Nhập maNV trên textbox
            String maNV = txtMANV.getText();
            //2. duyệt qua danh sách list tìm ra nhân viên có maNV bang maNV vua nhập
            boolean kq = false;
            for (Employee emp : list) {
                if (emp.getMaNV().equalsIgnoreCase(maNV)) {
                    kq = true; // tìm thấy

                    //3. lay ra vị trí của Nhân viên này trong danh sách list
                    currentIndex = list.indexOf(emp);
                    //4. xuất các thông tin của NV tìm duoc lên controls
                    showDetail();
                    //5. thoát khỏi for
                    break;
                }
            }
            if (kq == false) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã số : " + maNV);
            }
        } else if (txtHOTEN.getText().length() > 0) {
            //tim theo hoten
            String hoten = txtHOTEN.getText();
            //1. Khai báo 1 danh sách nhân viên list
            List<Employee> list_ketqua = new ArrayList<>();
            //2. duyệt qua danh sách list
            for (Employee emp : list) {
                if (emp.getHoTen().contains(hoten)) {
                    //3. thêm vào danh sách kết quả
                    list_ketqua.add(emp);
                }
            }
            //4. hiện thị danh sách ket qua lên table tblEmployee
            if (list_ketqua.size() > 0) {
                //1. lấy mô hình dữ liệu và xóa sạch các hàng
                DefaultTableModel model = (DefaultTableModel) tblEMPLOYEE.getModel();
                model.setRowCount(0);
                //2. duyệt qua danh sách nhân viên list, lấy từng nhân viên thêm vào table
                for (Employee emp : list_ketqua) {
                    Object[] row = new Object[]{emp.getMaNV(), emp.getHoTen(), emp.getTuoi(), emp.getEmail(), emp.getLuong()};
                    model.addRow(row);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy.");
            }
        }
    }
    public boolean  existsID(){
        String text = txtMANV.getText();
        for(Employee emp : list){
            if(emp.getMaNV().equalsIgnoreCase(text)){
                return true;
            }
        }
        return false;
    }
    public void reset() {
        //1. set các control về rỗng/null
        txtMANV.setText("");
        txtHOTEN.setText(null);
        txtTUOI.setText(null);
        txtEMAIL.setText(null);
        txtLUONG.setText(null);
    }

    public void orderByName() {
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.hoTen.compareTo(o2.hoTen);
            }
        };
        Collections.sort(list, com);
    }
    public void orderBySalary(){
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               Integer d1 = o1.luong;
               Integer d2 = o2.luong;
               return d1.compareTo(d2);
            }
        };
        Collections.sort(list,com);
    }
    public void updateEmp() throws Exception{
        String manv = txtMANV.getText();
        for(Employee emp : list){
            if(emp.getMaNV().equalsIgnoreCase(manv)){
                emp.setHoTen(txtHOTEN.getText());
                emp.setTuoi(Integer.parseInt(txtTUOI.getText()));
                emp.setEmail(txtEMAIL.getText());
                emp.setLuong(Integer.parseInt(txtLUONG.getText()));
                return;
            }
        }
    }
    private void btnPREVIOUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPREVIOUSActionPerformed
        //1. nếu chưa phải là nhân viên đầu tiên
        // thì về nhân viên trước nó
        if (currentIndex > 0) {
            currentIndex = currentIndex - 1;
        }
        //2. gọi hàm showDetail();
        showDetail();
    }//GEN-LAST:event_btnPREVIOUSActionPerformed

    private void btnFIRSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIRSTActionPerformed
        //1. Về vị trí nhân viên đầu tiên currentIndex = 0
        currentIndex = 0;
        //2. Gọi hàm showDetail
        this.showDetail();

    }//GEN-LAST:event_btnFIRSTActionPerformed

    private void btnLASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLASTActionPerformed
        // TODO add your handling code here:
        //1. Về vị trí nhân viên cuối cùng currentIndex = size()-1
        currentIndex = list.size() - 1;
        //2. Gọi hàm showDetail
        this.showDetail();
    }//GEN-LAST:event_btnLASTActionPerformed

    private void btnNEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEXTActionPerformed
        //1. nếu chưa phải là nhân viên cuối
        // thì nhảy qua nhân viên kế tiếp
        if (currentIndex < list.size() - 1) {
            currentIndex = currentIndex + 1;
        }
        //2. gọi hàm showDetail();
        showDetail();
    }//GEN-LAST:event_btnNEXTActionPerformed

    private void txtSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSAVEActionPerformed
        // TODO add your handling code here:

        this.addEmployee(); // thêm nhân viên vào list
        this.fillToTable();// điền dữ liệu từ list vào bảng.

        this.saveFile(); // lưu từ list xuống file ...  e:/employee.dat

    }//GEN-LAST:event_txtSAVEActionPerformed

    private void btnNEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWActionPerformed
        // TODO add your handling code here:

        // xóa trắng các control text fields.
        this.reset();
        txtMANV.requestFocus(); // con nháy nằm tại txtMANV
    }//GEN-LAST:event_btnNEWActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        //1. Xóa nhân viên tại vị trí currentIndex
        //list.remove(currentIndex);
        this.removeEmployee();
        //2. Hiện thị lên bảng
        fillToTable();
        //3. hiện thị trạng thái
        displayStatus();
        //4. lưu xuống file
        saveFile();
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void btnFINDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDActionPerformed
        // TODO add your handling code here:
        findEmployee();
    }//GEN-LAST:event_btnFINDActionPerformed

    private void btnEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXITActionPerformed
        // TODO add your handling code here:

        // Thoát khỏi chương trình
        System.exit(0);
    }//GEN-LAST:event_btnEXITActionPerformed

    private void btnOPENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOPENActionPerformed
        // TODO add your handling code here:

        // doc tu file e:/employee.dat lên danh sách list
        this.openFile();
        // đọc danh sách list lên table
        this.fillToTable();

    }//GEN-LAST:event_btnOPENActionPerformed

    private void tblEMPLOYEEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEMPLOYEEMouseClicked
        //1. xác định dòng nhân viên vừa click vào
        currentIndex = tblEMPLOYEE.getSelectedRow();
        //2. gọi hàm showDetail() để hiện thị tiết 
        // thông tin nhân viên tại vị trí currentIndex
        showDetail();
    }//GEN-LAST:event_tblEMPLOYEEMouseClicked

    private void btnOrderByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderByNameActionPerformed
        // TODO add your handling code here:
        this.orderByName();
        this.fillToTable();
    }//GEN-LAST:event_btnOrderByNameActionPerformed

    private void btnOrderBySalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderBySalaryActionPerformed
        // TODO add your handling code here:
        this.orderBySalary();
        this.fillToTable();
    }//GEN-LAST:event_btnOrderBySalaryActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            this.updateEmp();
        } catch (Exception ex) {
            Logger.getLogger(frmQUANLYNHANHVIEN.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.fillToTable();
        this.saveFile();
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmQUANLYNHANHVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQUANLYNHANHVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQUANLYNHANHVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQUANLYNHANHVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQUANLYNHANHVIEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnEXIT;
    private javax.swing.JButton btnFIND;
    private javax.swing.JButton btnFIRST;
    private javax.swing.JButton btnLAST;
    private javax.swing.JButton btnNEW;
    private javax.swing.JButton btnNEXT;
    private javax.swing.JButton btnOPEN;
    private javax.swing.JButton btnOrderByName;
    private javax.swing.JButton btnOrderBySalary;
    private javax.swing.JButton btnPREVIOUS;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lblDONGHO;
    private java.awt.Label lblStatus;
    private javax.swing.JTable tblEMPLOYEE;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtHOTEN;
    private javax.swing.JTextField txtLUONG;
    private javax.swing.JTextField txtMANV;
    private javax.swing.JButton txtSAVE;
    private javax.swing.JTextField txtTUOI;
    // End of variables declaration//GEN-END:variables
}
