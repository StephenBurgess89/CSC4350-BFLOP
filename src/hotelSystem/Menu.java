package hotelSystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Menu {

		static Color transparent = new Color(0,0,0,0);	
		static JPanel menuPanel = new JPanel();
		
			static ImageIcon checkInIcon = new ImageIcon("resource/checkIn.png"); 
			static ImageIcon customersIcon = new ImageIcon("resource/customers.png"); 
			static ImageIcon reservationsIcon = new ImageIcon("resource/reservations.png"); 
			static ImageIcon housekeepingIcon = new ImageIcon("resource/housekeeping.png");
			static ImageIcon roomServiceIcon = new ImageIcon("resource/roomService.png");
			static ImageIcon restaurantIcon = new ImageIcon("resource/restaurant.png"); 
			
			
			static JButton checkInButton = new JButton(checkInIcon);
			static JButton customersButton = new JButton(customersIcon);
			static JButton reservationsButton = new JButton(reservationsIcon);
			static JButton housekeepingButton = new JButton(housekeepingIcon);
			static JButton roomServiceButton = new JButton(roomServiceIcon);
			static JButton restaurantButton = new JButton(restaurantIcon);
			
			
	
			
		public static void menuPanel() {
			
			menuPanel.setLayout(null);
			menuPanel.setBackground(transparent);
			menuPanel.setBounds(0,40,110,975);
				
				checkInButton.setBackground(Home.myColor);
				checkInButton.setBounds(5,60,100,100);
				checkInButton.setToolTipText("Check-in Manager");
				checkInButton.addActionListener(new myActionListener());
			
				customersButton.setBackground(Home.myColor);
				customersButton.setBounds(5,210,100,100);
				customersButton.setToolTipText("Customer Manager");
				customersButton.addActionListener(new myActionListener());
			
				reservationsButton.setBackground(Home.myColor);
				reservationsButton.setBounds(5,360,100,100);
				reservationsButton.setToolTipText("Reservation Manager");
				reservationsButton.addActionListener(new myActionListener());

				housekeepingButton.setBackground(Home.myColor);
				housekeepingButton.setBounds(5,510,100,100);
				housekeepingButton.setToolTipText("Housekeeping");
				housekeepingButton.addActionListener(new myActionListener());
				
				roomServiceButton.setBackground(Home.myColor);
				roomServiceButton.setBounds(5,660,100,100);
				roomServiceButton.setToolTipText("Room Service");
				roomServiceButton.addActionListener(new myActionListener());
							
				restaurantButton.setBackground(Home.myColor);
				restaurantButton.setBounds(5,810,100,100);
				restaurantButton.setToolTipText("Restaurant Manager");
				restaurantButton.addActionListener(new myActionListener());
				
				
				
			menuPanel.add(checkInButton);
			menuPanel.add(customersButton);
			menuPanel.add(reservationsButton);	
			menuPanel.add(housekeepingButton);
			menuPanel.add(roomServiceButton);
			menuPanel.add(restaurantButton);
			menuPanel.setVisible(false);
			
			
		}
		
		private static class myActionListener implements ActionListener {
			
			public void actionPerformed(ActionEvent event){
				
				if(event.getSource() == checkInButton) {
					CheckIn.checkInPanel.setVisible(true);
					CustomerAccount.customersPanel.setVisible(false);
					Reservations.reservationsPanel.setVisible(false);
					AddReservation.addReservationPanel.setVisible(false);
					Housekeeping.housekeepingPanel.setVisible(false);
					Restaurant.roomService.setVisible(false);
					Restaurant.restaurantPanel.setVisible(false);
				}
				else if(event.getSource() == customersButton) {
					CheckIn.checkInPanel.setVisible(false);
					CustomerAccount.customersPanel.setVisible(true);
					CustomerAccount.searchCustomerField.requestFocus();
					Reservations.reservationsPanel.setVisible(false);
					AddReservation.addReservationPanel.setVisible(false);
					Housekeeping.housekeepingPanel.setVisible(false);
					Restaurant.roomService.setVisible(false);
					Restaurant.restaurantPanel.setVisible(false);
				}
				else if(event.getSource() == reservationsButton) {
					CheckIn.checkInPanel.setVisible(false);
					CustomerAccount.customersPanel.setVisible(false);
					Reservations.reservationsPanel.setVisible(true);
					AddReservation.addReservationPanel.setVisible(false);
					Reservations.searchCustomerField.requestFocus();
					Housekeeping.housekeepingPanel.setVisible(false);
					Restaurant.roomService.setVisible(false);
					Restaurant.restaurantPanel.setVisible(false);
				}
				else if(event.getSource() == housekeepingButton) {
					CheckIn.checkInPanel.setVisible(false);
					CustomerAccount.customersPanel.setVisible(false);
					Reservations.reservationsPanel.setVisible(false);
					AddReservation.addReservationPanel.setVisible(false);
					Housekeeping.housekeepingPanel.setVisible(true);
					Restaurant.roomService.setVisible(false);
					Restaurant.restaurantPanel.setVisible(false);
				}
				else if(event.getSource() == roomServiceButton) {
					CheckIn.checkInPanel.setVisible(false);
					CustomerAccount.customersPanel.setVisible(false);
					Reservations.reservationsPanel.setVisible(false);
					AddReservation.addReservationPanel.setVisible(false);
					Housekeeping.housekeepingPanel.setVisible(false);
					Restaurant.roomService.setVisible(true);
					Restaurant.restaurantPanel.setVisible(false);
				}
				else if(event.getSource() == restaurantButton) {
					CheckIn.checkInPanel.setVisible(false);
					CustomerAccount.customersPanel.setVisible(false);
					Reservations.reservationsPanel.setVisible(false);
					AddReservation.addReservationPanel.setVisible(false);
					Housekeeping.housekeepingPanel.setVisible(false);
					Restaurant.roomService.setVisible(false);
					Restaurant.restaurantPanel.setVisible(true);
				}			
			}
		}
}