package com.quaint.algorithm.year2019.verificationCode;//package com.quaint.studyproject.algorithm.algorithm2019.november.verificationCode;
//
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.util.Arrays;
//import java.util.Random;
//
//public class Demo{
//
//
//    public static void outputImage(int w, int h, OutputStream os, String code) throws IOException {
//        int verifySize = code.length();
//        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
//        Random rand = new Random();
//        Graphics2D g2 = image.createGraphics();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//        Color[] colors = new Color[5];
//        Color[] colorSpaces = new Color[] { Color.WHITE, Color.CYAN,
//                Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
//                Color.PINK, Color.YELLOW };
//        float[] fractions = new float[colors.length];
//        for(int i = 0; i < colors.length; i++){
//            colors[i] = colorSpaces[rand.nextInt(colorSpaces.length)];
//            fractions[i] = rand.nextFloat();
//        }
//        Arrays.sort(fractions);
//
//        g2.setColor(Color.GRAY);// 设置边框色
//        g2.fillRect(0, 0, w, h);
//
//        Color c = getRandColor(200, 250);
//        g2.setColor(c);// 设置背景色
//        g2.fillRect(0, 2, w, h-4);
//
//        //绘制干扰线
//        Random random = new Random();
//        g2.setColor(getRandColor(160, 200));// 设置线条的颜色
//        for (int i = 0; i < 20; i++) {
//            int x = random.nextInt(w - 1);
//            int y = random.nextInt(h - 1);
//            int xl = random.nextInt(6) + 1;
//            int yl = random.nextInt(12) + 1;
//            g2.drawLine(x, y, x + xl + 40, y + yl + 20);
//        }
//
//        // 添加噪点
//        float yawpRate = 0.05f;// 噪声率
//        int area = (int) (yawpRate * w * h);
//        for (int i = 0; i < area; i++) {
//            int x = random.nextInt(w);
//            int y = random.nextInt(h);
//            int rgb = getRandomIntColor();
//            image.setRGB(x, y, rgb);
//        }
//
//        shear(g2, w, h, c);// 使图片扭曲
//
//        g2.setColor(getRandColor(100, 160));
//        int fontSize = h - 4;
//        Font font = new Font("Algerian", Font.ITALIC, fontSize);
//        g2.setFont(font);
//        char[] chars = code.toCharArray();
//        for(int i = 0; i < verifySize; i++){
//            AffineTransform affine = new AffineTransform();
//            affine.setToRotation(Math.PI / 4 * rand.nextDouble() * (rand.nextBoolean() ? 1 : -1), (w / verifySize) * i + fontSize/2, h/2);
//            g2.setTransform(affine);
//            g2.drawChars(chars, i, 1, ((w-10) / verifySize) * i + 5, h/2 + fontSize/2 - 10);
//        }
//
//        g2.dispose();
//        ImageIO.write(image, "jpg", os);
//    }
//
//
//
//}
