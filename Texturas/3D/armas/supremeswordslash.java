// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class supremeswordslash_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "supremeswordslash_converted"), "main");
	private final ModelPart Centro;

	public supremeswordslash_Converted(ModelPart root) {
		this.Centro = root.getChild("Centro");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Centro = partdefinition.addOrReplaceChild("Centro", CubeListBuilder.create().texOffs(4, 31).addBox(7.0F, -3.0F, -16.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 1).addBox(7.0F, -5.0F, -15.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(21, 3).addBox(7.0F, -6.0F, -14.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 3).addBox(7.0F, -7.0F, -13.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2, 10).mirror().addBox(7.0F, -7.0F, -11.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(27, 0).addBox(7.0F, 7.0F, -11.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(28, 12).addBox(7.0F, -8.0F, -11.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(6, 11).addBox(7.0F, -7.0F, -9.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 13).addBox(7.0F, 1.0F, -9.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(7.0F, 2.0F, -8.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 20).addBox(7.0F, 4.0F, -7.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 24).addBox(7.0F, -7.0F, -8.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 32).addBox(7.0F, 6.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 33).addBox(7.0F, 7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 33).addBox(7.0F, 7.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 0).addBox(7.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 34).addBox(7.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 6).addBox(7.0F, -7.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 9).addBox(7.0F, -7.0F, -7.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 16.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Centro.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}