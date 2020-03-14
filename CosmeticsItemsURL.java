package clientname.cosmetics.impl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import clientname.url.UrlTextureUtil;
import clientname.url.UrlTextureUtil.ResourceLocationCallback;

import org.lwjgl.opengl.GL11;

public class CosmeticItems extends ModelBiped {
	
    private ResourceLocation img = null;

    private boolean hasTriedToDownload = false;

   public void render(EntityPlayerSP player, boolean isSneaking, boolean isFlying, boolean onGround, boolean isSprinting, int id) {
      this.postRender(player, isSneaking, isFlying, onGround, isSprinting, id);
   }

   private void postRender(EntityPlayerSP player, boolean isSneaking, boolean isFlying, boolean onGround, boolean isSprinting, int id) {
      this.render(player, isSneaking, isFlying, onGround, isSprinting, id);
   }

   public static void renderItemIn3D(WorldRenderer worldrenderer) {
      Tessellator tessellator = Tessellator.getInstance();
      GL11.glPushMatrix();
      GL11.glTranslated(0.0D, 0.0D, 0.0D);
      GL11.glEnable(32826);
      GL11.glTranslatef(1.0F, -0.10000001F, 0.1F);
      GL11.glScalef(1.875F, 1.875F, 1.0F);
      GL11.glRotatef(0.0F, 0.0F, 200.0F, 0.0F);
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
      GL11.glScaled(1.0D, 1.0D, 0.7D);
      worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
      worldrenderer.pos(0.0D, 0.0D, 0.0D).tex(1.0D, 1.0D).normal(0.0F, 0.0F, 1.0F).endVertex();
      worldrenderer.pos(1.0D, 0.0D, 0.0D).tex(0.0D, 1.0D).normal(0.0F, 0.0F, 1.0F).endVertex();
      worldrenderer.pos(1.0D, 1.0D, 0.0D).tex(0.0D, 0.0D).normal(0.0F, 0.0F, 1.0F).endVertex();
      worldrenderer.pos(0.0D, 1.0D, 0.0D).tex(1.0D, 0.0D).normal(0.0F, 0.0F, 1.0F).endVertex();
      tessellator.draw();
      worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
      worldrenderer.pos(0.0D, 1.0D, -0.078125D).tex(1.0D, 0.0D).normal(0.0F, 0.0F, -1.0F).endVertex();
      worldrenderer.pos(1.0D, 1.0D, -0.078125D).tex(0.0D, 0.0D).normal(0.0F, 0.0F, -1.0F).endVertex();
      worldrenderer.pos(1.0D, 0.0D, -0.078125D).tex(0.0D, 1.0D).normal(0.0F, 0.0F, -1.0F).endVertex();
      worldrenderer.pos(0.0D, 0.0D, -0.078125D).tex(1.0D, 1.0D).normal(0.0F, 0.0F, -1.0F).endVertex();
      tessellator.draw();
      worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);

      int k;
      float f1;
      float f2;
      for(k = 0; (float)k < 32.0F; ++k) {
         f1 = (float)k / 32.0F;
         f2 = 1.0F + -1.0F * f1 - 0.015625F;
         worldrenderer.pos((double)f1, 0.0D, -0.078125D).tex((double)f2, 1.0D).normal(-1.0F, 0.0F, 0.0F).endVertex();
         worldrenderer.pos((double)f1, 0.0D, 0.0D).tex((double)f2, 1.0D).normal(-1.0F, 0.0F, 0.0F).endVertex();
         worldrenderer.pos((double)f1, 1.0D, 0.0D).tex((double)f2, 0.0D).normal(-1.0F, 0.0F, 0.0F).endVertex();
         worldrenderer.pos((double)f1, 1.0D, -0.078125D).tex((double)f2, 0.0D).normal(-1.0F, 0.0F, 0.0F).endVertex();
      }

      tessellator.draw();
      worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);

      for(k = 0; (float)k < 32.0F; ++k) {
         f1 = (float)k / 32.0F;
         f2 = 1.0F + -1.0F * f1 - 0.015625F;
         f1 += 0.03125F;
         worldrenderer.pos((double)f1, 1.0D, -0.078125D).tex((double)f2, 0.0D).normal(1.0F, 0.0F, 0.0F).endVertex();
         worldrenderer.pos((double)f1, 1.0D, 0.0D).tex((double)f2, 0.0D).normal(1.0F, 0.0F, 0.0F).endVertex();
         worldrenderer.pos((double)f1, 0.0D, 0.0D).tex((double)f2, 1.0D).normal(1.0F, 0.0F, 0.0F).endVertex();
         worldrenderer.pos((double)f1, 0.0D, -0.078125D).tex((double)f2, 1.0D).normal(1.0F, 0.0F, 0.0F).endVertex();
      }

      tessellator.draw();
      worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);

      for(k = 0; (float)k < 32.0F; ++k) {
         f1 = (float)k / 32.0F;
         f2 = 1.0F + -1.0F * f1 - 0.015625F;
         f1 += 0.03125F;
         worldrenderer.pos(0.0D, (double)f1, 0.0D).tex(1.0D, (double)f2).normal(0.0F, 1.0F, 0.0F).endVertex();
         worldrenderer.pos(1.0D, (double)f1, 0.0D).tex(0.0D, (double)f2).normal(0.0F, 1.0F, 0.0F).endVertex();
         worldrenderer.pos(1.0D, (double)f1, -0.078125D).tex(0.0D, (double)f2).normal(0.0F, 1.0F, 0.0F).endVertex();
         worldrenderer.pos(0.0D, (double)f1, -0.078125D).tex(1.0D, (double)f2).normal(0.0F, 1.0F, 0.0F).endVertex();
      }

      tessellator.draw();
      worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);

      for(k = 0; (float)k < 32.0F; ++k) {
         f1 = (float)k / 32.0F;
         f2 = 1.0F + -1.0F * f1 - 0.015625F;
         worldrenderer.pos(1.0D, (double)f1, 0.0D).tex(0.0D, (double)f2).normal(0.0F, -1.0F, 0.0F).endVertex();
         worldrenderer.pos(0.0D, (double)f1, 0.0D).tex(1.0D, (double)f2).normal(0.0F, -1.0F, 0.0F).endVertex();
         worldrenderer.pos(0.0D, (double)f1, -0.078125D).tex(1.0D, (double)f2).normal(0.0F, -1.0F, 0.0F).endVertex();
         worldrenderer.pos(1.0D, (double)f1, -0.078125D).tex(0.0D, (double)f2).normal(0.0F, -1.0F, 0.0F).endVertex();
      }

      tessellator.draw();
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   public void render(ModelRenderer model, Entity entityIn, int id) {
	   
	   if(img == null && !hasTriedToDownload) {
			hasTriedToDownload = true;
			UrlTextureUtil.downloadAndSetTexture("http://example.com/items.png", new ResourceLocationCallback() {
				
				@Override
				public void onTextureLoaded(ResourceLocation rl) {
					img = rl;
				}
			});
		}
      Tessellator tessellator = Tessellator.getInstance();
      GL11.glRotatef(-29.0F, 3.0F, 0.0F, 0.0F);
      GL11.glRotatef(90.0F, 0.0F, 0.5F, 0.0F);
      GL11.glTranslatef(-0.15F, 0.125F, 0.3F);
      if (entityIn.isSneaking()) {
         GL11.glRotatef(model.rotateAngleX * 57.295776F, 0.0F, 0.0F, 0.5F);
      } else {
         GL11.glRotatef(model.rotateAngleX * 57.295776F, 0.0F, 0.0F, 1.0F);
      }

      GL11.glRotatef(model.rotateAngleY * 57.295776F, 0.0F, 0.0F, 0.0F);
      GL11.glRotatef(model.rotateAngleZ * -57.295776F, 1.5F, 0.0F, 0.0F);
      Minecraft.getMinecraft().getTextureManager().bindTexture(img);
      renderItemIn3D(tessellator.getWorldRenderer());
      GL11.glPopMatrix();
      GL11.glPushMatrix();
   }
}
