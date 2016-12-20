package com.shrinivas.imageprocessing.samples;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import com.shrinivas.imageprocessing.ImageType;
import com.shrinivas.imageprocessing.Transformation;
import com.shrinivas.imageprocessing.Utility;

public class Main {

	static String[] images = { "aamir", "parrot", "shahrukh" };

	public static void main(String[] args) throws IOException {
		for (String imageName : images) {
			File image = new File("D:/imageproc/" + imageName + ".jpg");
			BufferedImage bufferedImage = Utility.readImage(image);

			// Negative image
			File negativeImage = Utility.getTransformedFile(image, "negative");
			BufferedImage negativeBufferedImage = Transformation
					.toNegative(bufferedImage);
			Utility.writeImage(negativeBufferedImage, ImageType.JPG,
					negativeImage);

			// Grayscale image
			File grayscaleImage = Utility
					.getTransformedFile(image, "grayscale");
			BufferedImage grayscaleBufferedImage = Transformation
					.toGrayscale(bufferedImage);
			Utility.writeImage(grayscaleBufferedImage, ImageType.JPG,
					grayscaleImage);

			// Grayscale image
			File blackAndWhiteImage = Utility.getTransformedFile(image,
					"blackAndWhite");
			BufferedImage blackAndWhiteBufferedImage = Transformation
					.toBlackAndWhite(bufferedImage);
			Utility.writeImage(blackAndWhiteBufferedImage, ImageType.JPG,
					blackAndWhiteImage);
		}
	}
}
