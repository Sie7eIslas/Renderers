// Code generated by dagger-compiler.  Do not edit.
package com.pedrogomez.renderers.sample.ui.builder;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<VideoRendererBuilder>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code VideoRendererBuilder} and its
 * dependencies.
 *
 * Being a {@code Provider<VideoRendererBuilder>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<VideoRendererBuilder>} and handling injection
 * of annotated fields.
 */
public final class VideoRendererBuilder$$InjectAdapter extends Binding<VideoRendererBuilder>
    implements Provider<VideoRendererBuilder>, MembersInjector<VideoRendererBuilder> {
  private Binding<android.content.Context> context;
  private Binding<com.pedrogomez.renderers.sample.ui.renderers.VideoRenderer.OnVideoClicked> onVideoClicked;
  private Binding<com.pedrogomez.renderers.RendererBuilder> supertype;

  public VideoRendererBuilder$$InjectAdapter() {
    super("com.pedrogomez.renderers.sample.ui.builder.VideoRendererBuilder", "members/com.pedrogomez.renderers.sample.ui.builder.VideoRendererBuilder", NOT_SINGLETON, VideoRendererBuilder.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", VideoRendererBuilder.class, getClass().getClassLoader());
    onVideoClicked = (Binding<com.pedrogomez.renderers.sample.ui.renderers.VideoRenderer.OnVideoClicked>) linker.requestBinding("com.pedrogomez.renderers.sample.ui.renderers.VideoRenderer$OnVideoClicked", VideoRendererBuilder.class, getClass().getClassLoader());
    supertype = (Binding<com.pedrogomez.renderers.RendererBuilder>) linker.requestBinding("members/com.pedrogomez.renderers.RendererBuilder", VideoRendererBuilder.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    getBindings.add(context);
    getBindings.add(onVideoClicked);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<VideoRendererBuilder>}.
   */
  @Override
  public VideoRendererBuilder get() {
    VideoRendererBuilder result = new VideoRendererBuilder(context.get(), onVideoClicked.get());
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<VideoRendererBuilder>}.
   */
  @Override
  public void injectMembers(VideoRendererBuilder object) {
    supertype.injectMembers(object);
  }

}
