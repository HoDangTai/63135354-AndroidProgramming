package ntu_63135354;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class Cau1_AppBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtChieucao;
	private JTextField txtCannang;
	private JTextField txtBMI;
	private JTextField txtLoikhuyen;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Cau1_AppBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("App Tính Chỉ Số BMI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(124, 21, 191, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpChiuCao = new JLabel("Nhập Chiều Cao (cm):");
		lblNhpChiuCao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhpChiuCao.setBounds(10, 72, 148, 32);
		contentPane.add(lblNhpChiuCao);
		
		JLabel lblNhpCnNng = new JLabel("Nhập Cân Nặng (Kg):");
		lblNhpCnNng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhpCnNng.setBounds(10, 132, 148, 32);
		contentPane.add(lblNhpCnNng);
		
		txtChieucao = new JTextField();
		txtChieucao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtChieucao.setBounds(183, 72, 191, 37);
		contentPane.add(txtChieucao);
		txtChieucao.setColumns(10);
		
		txtCannang = new JTextField();
		txtCannang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCannang.setColumns(10);
		txtCannang.setBounds(183, 132, 191, 37);
		contentPane.add(txtCannang);
		
		JLabel lblNhpCnNng_1 = new JLabel("Nhập Cân Nặng (Kg):");
		lblNhpCnNng_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhpCnNng_1.setBounds(10, 293, 148, 32);
		contentPane.add(lblNhpCnNng_1);
		
		txtBMI = new JTextField();
		txtBMI.setEditable(false);
		txtBMI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBMI.setColumns(10);
		txtBMI.setBounds(183, 293, 191, 37);
		contentPane.add(txtBMI);
		
		txtLoikhuyen = new JTextField();
		txtLoikhuyen.setHorizontalAlignment(SwingConstants.CENTER);
		txtLoikhuyen.setEditable(false);
		txtLoikhuyen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLoikhuyen.setColumns(10);
		txtLoikhuyen.setBounds(10, 340, 364, 82);
		contentPane.add(txtLoikhuyen);
		
		JButton btnKtra = new JButton("Kiểm Tra");
		btnKtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLiBMI();
			}
		});
		btnKtra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKtra.setBounds(124, 201, 136, 61);
		contentPane.add(btnKtra);
	}
	void XuLiBMI() {
		String Str_height = txtChieucao.getText();
		String Str_weight = txtCannang.getText();
		Double h = Double.parseDouble(Str_height);
		Double W = Double.parseDouble(Str_weight);
		Double H = h/100;
		Double BMI = W/(H*H);
		if(BMI < 18.5) {
			txtChieucao.setText("");
			txtCannang.setText("");
			txtBMI.setText(String.valueOf(BMI));
			txtLoikhuyen.setText("Bạn bị thiếu cân!");
		}else if(BMI >= 18.5 && BMI <= 24.9) {
			txtChieucao.setText("");
			txtCannang.setText("");
			txtBMI.setText(String.valueOf(BMI));
			txtLoikhuyen.setText("Bạn có một cơ thể tốt!");
		}else if (BMI >= 25.0 && BMI <= 29.9) {
			txtChieucao.setText("");
			txtCannang.setText("");
			txtBMI.setText(String.valueOf(BMI));
			txtLoikhuyen.setText("Bạn đang bị thừa cân!");
		}else if(BMI > 30.0) {
			txtChieucao.setText("");
			txtCannang.setText("");
			txtBMI.setText(String.valueOf(BMI));
			txtLoikhuyen.setText("Bạn đang bị béo phì!");
		}
	}
}
