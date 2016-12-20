package com.shrinivas.imageprocessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Transformation {
	public static BufferedImage toNegative(BufferedImage image) {
		int height = image.getHeight();
		int width = image.getWidth();

		BufferedImage negativeImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int originalRGB = image.getRGB(i, j);
				Color originalColor = new Color(originalRGB);
				int originalRed = originalColor.getRed();
				int originalGreen = originalColor.getGreen();
				int originalBlue = originalColor.getBlue();

				int negativeRed = 255 - originalRed;
				int negativeGreen = 255 - originalGreen;
				int negativeBlue = 255 - originalBlue;
				Color negativeColor = new Color(negativeRed, negativeGreen,
						negativeBlue);
				int negativeRGB = negativeColor.getRGB();
				negativeImage.setRGB(i, j, negativeRGB);
			}
		}
		return negativeImage;
	}

	public static BufferedImage toGrayscale(BufferedImage image) {
		int height = image.getHeight();
		int width = image.getWidth();

		BufferedImage grayscaleImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int originalRGB = image.getRGB(i, j);
				Color originalColor = new Color(originalRGB);
				int originalRed = originalColor.getRed();
				int originalGreen = originalColor.getGreen();
				int originalBlue = originalColor.getBlue();

				int grayscaleShade = (originalRed + originalGreen + originalBlue) / 3;

				int grayscaleRed = grayscaleShade;
				int grayscaleGreen = grayscaleShade;
				int grayscaleBlue = grayscaleShade;
				Color grayscaleColor = new Color(grayscaleRed, grayscaleGreen,
						grayscaleBlue);
				int grayscaleRGB = grayscaleColor.getRGB();
				grayscaleImage.setRGB(i, j, grayscaleRGB);
			}
		}
		return grayscaleImage;
	}

	public static BufferedImage toBlackAndWhite(BufferedImage image) {
		int height = image.getHeight();
		int width = image.getWidth();

		BufferedImage blackAndWhiteImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int originalRGB = image.getRGB(i, j);
				Color originalColor = new Color(originalRGB);
				int originalRed = originalColor.getRed();
				int originalGreen = originalColor.getGreen();
				int originalBlue = originalColor.getBlue();

				int grayscaleShade = (originalRed + originalGreen + originalBlue) / 3;

				int blackAndWhiteRed;
				int blackAndWhiteGreen;
				int blackAndWhiteBlue;
				if (grayscaleShade < 128) {
					blackAndWhiteRed = 0;
					blackAndWhiteGreen = 0;
					blackAndWhiteBlue = 0;
				} else {
					blackAndWhiteRed = 255;
					blackAndWhiteGreen = 255;
					blackAndWhiteBlue = 255;
				}

				Color blackAndWhiteColor = new Color(blackAndWhiteRed,
						blackAndWhiteGreen, blackAndWhiteBlue);
				int blackAndWhiteRGB = blackAndWhiteColor.getRGB();
				blackAndWhiteImage.setRGB(i, j, blackAndWhiteRGB);
			}
		}
		return blackAndWhiteImage;
	}

}
