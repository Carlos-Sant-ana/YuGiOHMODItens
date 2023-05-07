// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class supremekingarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "supremekingarmor"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public supremekingarmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -12.0F, -6.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 39).addBox(-2.0F, -9.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 30).addBox(1.0F, -9.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 70).addBox(2.0F, -10.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(69, 59).addBox(3.0F, -11.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(69, 15).addBox(-4.0F, -11.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 69).addBox(-3.0F, -10.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 56).addBox(1.0F, -2.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 45).addBox(-5.0F, -2.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(4.0F, -9.0F, -4.0F, 1.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(15, 16).addBox(-5.0F, -9.0F, -4.0F, 1.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(32, 48).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(47, 30).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 43).addBox(-1.0F, -9.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(47, 4).addBox(-6.0F, 0.0F, -2.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(4.0F, 0.0F, -2.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(42, 19).addBox(-7.0F, -2.0F, -3.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(38, 37).addBox(6.0F, -2.0F, -3.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(20, 9).addBox(-7.0F, -2.0F, 6.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 0).addBox(-4.0F, 0.0F, 4.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(63, 13).addBox(6.0F, -10.0F, -3.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(57, 61).addBox(6.0F, -11.0F, 1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 62).addBox(6.0F, -10.0F, 5.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 15).addBox(-7.0F, -10.0F, 5.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(51, 60).addBox(-7.0F, -11.0F, 1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(62, 1).addBox(-7.0F, -10.0F, -3.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 0).addBox(5.0F, -10.0F, 6.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 25).addBox(-6.0F, -10.0F, 6.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 67).addBox(1.0F, -9.0F, 6.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 61).addBox(-3.0F, -9.0F, 6.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 10).addBox(-1.0F, -6.0F, 6.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 67).addBox(-5.0F, -8.0F, 6.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 67).addBox(3.0F, -8.0F, 6.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 63).addBox(6.0F, -8.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(39, 63).addBox(6.0F, -8.0F, 3.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -8.0F, 3.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-7.0F, -8.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(49, 40).addBox(-5.0F, -3.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 25).addBox(-5.0F, -2.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 58).addBox(-7.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(44, 3).addBox(-8.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 56).addBox(-7.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(65, 35).addBox(-5.0F, 5.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(67, 67).addBox(-5.0F, 3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(71, 19).addBox(-4.0F, 7.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, -2.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 7).addBox(3.0F, 7.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(3.0F, 5.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(65, 40).addBox(4.0F, 3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 42).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 34).addBox(7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 45).addBox(5.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(5.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 12).addBox(-1.0F, -2.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 35).addBox(-1.0F, -3.0F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(53, 13).addBox(-3.0F, -1.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(60, 53).addBox(-3.0F, -1.0F, -3.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 58).addBox(-3.0F, -1.0F, 2.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(1.0F, 1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 13).addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 23).addBox(-1.0F, 4.0F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 12).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(50, 48).addBox(2.2F, -1.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(18, 67).addBox(-0.8F, 4.0F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 39).addBox(-1.8F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 30).addBox(-1.8F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-0.8F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(-1.8F, 1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 50).addBox(-1.8F, -1.0F, -3.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 58).addBox(-1.8F, -1.0F, 2.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}