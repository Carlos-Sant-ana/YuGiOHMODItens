// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class supremekinghelmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "supremekinghelmet"), "main");
	private final ModelPart Head;

	public supremekinghelmet(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -11.0F, -7.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(2.0F, -8.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(3.0F, -9.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -9.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(-3.0F, -8.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(-4.0F, -9.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 32).addBox(-4.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 32).addBox(3.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 23).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-5.0F, -9.0F, -5.0F, 1.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(4.0F, -9.0F, -5.0F, 1.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(20, 33).addBox(-5.0F, -9.0F, 4.0F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 8).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-1.0F, -10.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}