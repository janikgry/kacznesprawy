package net.mcreator.kaczka.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelprelude_man<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("kaczka", "modelprelude_man"), "main");
	public final ModelPart chinczyk;

	public Modelprelude_man(ModelPart root) {
		this.chinczyk = root.getChild("chinczyk");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition chinczyk = partdefinition.addOrReplaceChild("chinczyk", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition base = chinczyk.addOrReplaceChild(
				"base", CubeListBuilder.create().texOffs(0, 21).addBox(-5.0F, -2.0F, -5.0F, 12.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(28, 35).addBox(-4.0F, -10.0F, -4.0F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 0.0F, 0.0F));
		PartDefinition neck = chinczyk.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, -11.0F, -3.0F, 8.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, 0.0F));
		PartDefinition main = chinczyk.addOrReplaceChild("main",
				CubeListBuilder.create().texOffs(44, 18).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -21.0F, 0.0F));
		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 34).addBox(1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(56, 0).addBox(-3.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition head = chinczyk.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-2.0F, -2.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 2)
						.addBox(-5.0F, -2.0F, 3.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(2.0F, -2.0F, -4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(43, 5)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -34.0F, 0.0F));
		PartDefinition cube_r3 = head
				.addOrReplaceChild(
						"cube_r3", CubeListBuilder.create().texOffs(56, 10).mirror()
								.addBox(1.25F, 3.5F, 1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 15).addBox(-3.25F, 3.5F, 1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 14)
						.addBox(-4.35F, 3.5F, -4.35F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r5 = head
				.addOrReplaceChild(
						"cube_r5", CubeListBuilder.create().texOffs(30, 13).mirror()
								.addBox(1.0F, -35.0F, -7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 33.5F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(18, 13).addBox(-3.0F, -35.0F, -7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 33.5F, 0.0F, 0.0F, 0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 52);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		chinczyk.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
