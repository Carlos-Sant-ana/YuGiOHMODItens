// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class supremekinghelmet extends ModelBase {
	private final ModelRenderer Head;

	public supremekinghelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 32, -1.0F, -11.0F, -7.0F, 2, 8, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, 1.0F, -9.0F, -6.0F, 1, 5, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 0, 2.0F, -8.0F, -6.0F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 0, 3.0F, -9.0F, -6.0F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -2.0F, -9.0F, -6.0F, 1, 5, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 0, -3.0F, -8.0F, -6.0F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 0, -4.0F, -9.0F, -6.0F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 11, 32, -4.0F, -8.0F, -5.0F, 1, 8, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 11, 32, 3.0F, -8.0F, -5.0F, 1, 8, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, 1.0F, -2.0F, -5.0F, 2, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -3.0F, -2.0F, -5.0F, 2, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 23, 23, -4.0F, -9.0F, -5.0F, 8, 1, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 32, -5.0F, -9.0F, -5.0F, 1, 9, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 32, 4.0F, -9.0F, -5.0F, 1, 9, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 20, 33, -5.0F, -9.0F, 4.0F, 10, 9, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 8, -4.0F, -10.0F, -4.0F, 8, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 6, -1.0F, -10.0F, -6.0F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}