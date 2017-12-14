package extras;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
String a=JOptionPane.showInputDialog("What is your star sign?");

 if(a.equals("Aries")) {
JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action");

 }
 else if(a.equals("Taurus")) {
	 JOptionPane.showMessageDialog(null,"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");

 }
 else if(a.equals("Gemini")){
	 JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
 }
 else if(a.equals("Cancer")) {
	 JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
 }
 else if(a.equals("Leo")) {
	 JOptionPane.showConfirmDialog(null, "Generous, organized, protective, beautiful.");
 }
 else if(a.equals("Virgo")) {
	 JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
 }
 else if(a.equals("Libra")) {
	 JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
 }
 else if(a.equals("Scorpio")) {
	 JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective");  
	 
 }
 else if(a.equals("Sagittarius")) {
	 JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
 }
 else if(a.equals("Capricorn")) {
	 JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
 }
 else if(a.equals("Aquarius")) {
	 JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
 }
 else if(a.equals("Pisces")) {
	 JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive"); 
	 	
 }
 else {
	 JOptionPane.showMessageDialog(null, "Thats not a star sign");
 }
 }

}
