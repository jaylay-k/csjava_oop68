// ในคลาส GameFrame
class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Knight Adventure");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MenuPanel menuPanel = new MenuPanel();
        add(menuPanel);

        // แทนที่จะใช้ pack() อย่างเดียว ให้กำหนดขนาดเผื่อไว้ด้วย
        setSize(1024, 610); 
        setLocationRelativeTo(null);
        setResizable(false);
    }
}

// ในคลาส MenuPanel
class MenuPanel extends JPanel {
    private Image backgroundImage;

    public MenuPanel() {
        // ใช้การโหลดแบบตรวจเช็คสถานะ
        ImageIcon icon = new ImageIcon("2.jpg");
        
        // เช็คว่าโหลดรูปสำเร็จไหม ถ้าไม่สำเร็จให้พ่น Error ออกมาที่ Terminal
        if (icon.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.err.println("Error: ไม่พบไฟล์รูปภาพ 2.jpg กรุณาเช็คที่อยู่ไฟล์!");
        }
        
        backgroundImage = icon.getImage();
        setLayout(null);
        createPlayButton();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // วาดรูปโดยยืดให้เต็ม Panel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
    
    private void createPlayButton() {
        ImageIcon playIcon = new ImageIcon("10.png");
        JButton playButton = new JButton(playIcon);
        
        // ปรับตำแหน่งปุ่มให้ตรงกลาง (ลองปรับเลข 380, 250 ดูครับ)
        playButton.setBounds(380, 250, 260, 110);
        
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
        playButton.setFocusPainted(false);
        
        playButton.addActionListener(e -> {
            System.out.println("Button Clicked!");
        });
        
        add(playButton);
    }
}