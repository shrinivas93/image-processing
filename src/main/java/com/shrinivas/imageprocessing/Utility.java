package com.shrinivas.imageprocessing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class Utility {
	public static BufferedImage readImage(File image) throws IOException {
		return ImageIO.read(image);
	}

	public static BufferedImage readImage(URL image) throws IOException {
		return ImageIO.read(image);
	}

	public static BufferedImage readImage(InputStream image) throws IOException {
		return ImageIO.read(image);
	}

	public static BufferedImage readImage(ImageInputStream image)
			throws IOException {
		return ImageIO.read(image);
	}

	public static void writeImage(BufferedImage image, ImageType imageType,
			File imageFile) throws IOException {
		ImageIO.write(image, imageType.name(), imageFile);
	}

	public static File getTransformedFile(File file, String suffix) {
		String absolutePath = file.getAbsolutePath();
		String[] split = absolutePath.split("\\.");
		if (split.length == 2) {
			return new File(split[0] + "_" + suffix + "." + split[1]);
		}
		return new File(split[0] + "_" + suffix);
	}

}
